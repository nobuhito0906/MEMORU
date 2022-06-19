import Vue from 'vue'
import Router from 'vue-router'
import login from './src/pages/login.vue'
import app from './src/main.js'

Vue.use(Router)

export default new Router({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        {
            path: '/',
            name: 'login',
            component: login
        },
        {
            path: '/app',
            name: 'app',
            component: app
        }
    ]
})