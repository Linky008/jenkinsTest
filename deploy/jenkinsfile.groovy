#!groovy
//电子房价牌
//library 'CoreWeb'
def map = [:]
map.put("PROJECT_FOLDER","src/CoreWeb")
map.put('PROJECT_NAME','CoreWeb')
//map.put('IMAGE_NAME','bthgyouxuan')
map.put('GIT_URL','https://github.com/Linky008/jenkinsTest')
map.put('SIT_PREVIEW_URL','http://192.168.222.128:31025')
map.put('UAT_PREVIEW_URL','http://192.168.222.128:31025')
map.put('PROD_PREVIEW_URL','http://192.168.222.128:31025')

map.put('DEPLOY_ENV','sit\nprod')
map.put('DEPLOY_VERSION','1.0')
map.put('REGISTRY_URL','http://192.168.222.1')

//netCoreDeployToK8s(map)

