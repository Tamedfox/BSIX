import request from '@utils/request'

export function login(params){
    return request({
        url: 'admin/login',
        method: 'post',
        params: params
    })
}



