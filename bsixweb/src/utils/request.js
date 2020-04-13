import axios from 'axios'
import { Message } from 'element-ui'

//创建axios实例
const service = axios.create({
    baseURL: process.env.VUE_APP_BASE_API, //API的BASE_URL
    timeout: 15000 // 请求超时时间
})

// request拦截器
service.interceptors.request.use(config => {
    //携带token
    return config
}, error => {
    // Do something with request error
    console.log(error) // for debug
    Promise.reject(error)
})

//response拦截器
service.interceptors.response.use(
    response => {
        //拦截所有非code 200的相应，即抛出错误的response
        const res = response.data
        if (res.code !== 200) {
            Message({
                message:res.message,
                type:'error',
                duration: 2 * 1000
            })

            //其他code判断
            return Promise.reject('error')
        } else {
            return response.data
        }

    },error => {
        console.log('错误：' + error.message)
        Message({
            message:error.message,
            type:'error',
            duration:2 * 1000
        })
        return Promise.reject(error)
    }
)

export default service
