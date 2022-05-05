// import 'vuetify/styles'
import * as directives from 'vuetify/directives'
import * as components from 'vuetify/components'
import { createApp } from 'vue'
import { createVuetify } from 'vuetify'
import VueGoodTablePlugin from 'vue-good-table-next';
// import the styles
import 'vue-good-table-next/dist/vue-good-table-next.css'

import App from './App.vue'
const app = createApp(App)
const vuetify = createVuetify({
    components,
    directives
})

app.use(vuetify)
app.use(VueGoodTablePlugin)
app.mount('#app')

