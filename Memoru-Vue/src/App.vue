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
import rows from "./assets/Todo.json";
import axios from "./services/axios";
// import apiSerivce from "./services/ApiService";
export default {
  name: "Todos",
  data() {
    return {
      userId: "",
      columns: columns,
      rows: rows,
      data: null,
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
          this.data = res.data;
          console.log("data:", res.data);
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
