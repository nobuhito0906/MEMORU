<template>
  <div>
    <input v-model="userId" />
    <p>userId:{{ userId }}</p>
    <vue-good-table :columns="columns" :rows="rows" />
  </div>
</template>

<script lang="ts">
export default {
  name: "Todos",
  data() {
    return {
      userId: "",
      columns: [
        {
          label: "ID",
          field: "id",
          type: "number",
        },
        {
          label: "メモ",
          field: "memo",
        },
        {
          label: "備考",
          field: "remarks",
        },
        {
          label: "ユーザID",
          field: "userId",
        },
        {
          label: "行動日",
          field: "actionDate",
          type: "date",
          dateInputFormat: "yyyy-MM-dd'T'HH:mm:ss.SSSX",
          dateOutputFormat: "MMM do yy",
        },
      ],
      rows: [
        {
          id: 111,
          memo: "メモ1",
          remarks: "備考1",
          userId: "ABD",
          actionDate: new Date(),
        },
      ],
    };
  },
};
</script>
