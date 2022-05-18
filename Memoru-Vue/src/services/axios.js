import axios from "axios";

const axios_instance = axios.create();
axios_instance.interceptors.request.use(config => {
    config.headers = {
        'Access-Control-Allow-Origin':'*'
    }
})

export default axios;