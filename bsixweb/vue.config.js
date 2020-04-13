const path = require('path')

function resolve (dir) {
    return path.join(__dirname, dir)
}

module.exports = {
    chainWebpack: config => {
        config.resolve.alias
            .set('@', resolve('src')) // 设置路径别名
            .set('@components', resolve('src/components'))
            .set('@utils', resolve('src/utils'))
            .set('@views', resolve('src/views')) // 设置路径别名
    },
    devServer: {
        proxy: {
            '/api': {
                target: 'http://localhost:8887',
                changeOrigin: true,
                pathRewrite: {'^/api': ''}
            },
        }
    }
}


