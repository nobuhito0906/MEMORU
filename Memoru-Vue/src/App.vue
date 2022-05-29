<template>
  <div>
    <input v-model="userId" />
    <p>userId:{{ userId }}</p>
    <vue-good-table :columns="columns" :rows="rows" />
    <button @click="getTodo">TODOリスト取得</button>
    <button @click="getHello">Helloボタン</button>
    {{ data }}
  </div>
</template>

<script lang="ts">
import columns from "./assets/TodoColumns.json";
import axios from "./services/axios";
import convertUtil from "./components/convertUtil";
export default {
  name: "Todos",
  data() {
    return {
      userId: "",
      columns: columns,
      rows: [],
      data: null,
      row: {
        id: null,
        memo: "",
        remarks: "",
        actionDate: "",
        actionTime: "",
        actionFlag: false,
      },
    };
  },
  methods: {
    getTodo(event: any) {
      console.log("userId:", this.userId);
      axios
        .get("/api/memo", {
          params: {
            userId: this.userId,
          },
        })
        .then((res) => {
          const data = res.data;
          console.log("data:", res.data);
          data.forEach((elm) => {
            this.row["id"] = elm.id;
            this.row["memo"] = elm.memo;
            this.row["remarks"] = elm.remarks;
            this.row["actionDate"] = elm.actionDate;
            this.row["actionTime"] = convertUtil.convertTime(elm.actionTime);
            this.row["actionFlag"] = convertUtil.convertFlag(elm.actionFlag);
            this.row["version"] = elm.version;
            this.rows.push(this.row);
          });
        })
        .catch((err) => {
          console.log("err:", err);
        });
    },

    getHello(event: any) {
      console.log("userId:", this.userId);
      axios
        .get("/api/hello", {
          params: {
            name: this.userId,
          },
        })
        .then((res) => {
          this.data = res.data;
          console.log("data:", res.data);
        })
        .catch((err) => {
          console.log("err:", err);
        });
    },
  },
};
</script>
