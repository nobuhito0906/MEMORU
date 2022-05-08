<template>
  <div>
    <input v-model="userId" />
    <p>userId:{{ userId }}</p>
    <vue-good-table :columns="columns" :rows="rows" />
  </div>
</template>

<script lang="ts">
import columns from './assets/TodoColumns.json'
import rows from './assets/Todo.json'
export default {
  name: "Todos",
  data() {
    return {
      userId: "",
      columns: columns,
      rows: rows
    };
  },
};
</script>
