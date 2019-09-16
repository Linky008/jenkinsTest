#!groovy
//电子房价牌
library 'common'
def map = [:]
map.put("PROJECT_FOLDER","src/HomeInnsEBusiness.H5")
map.put('PROJECT_NAME','HomeInnsEBusiness.H5')
map.put('IMAGE_NAME','bthgyouxuan')
map.put('GIT_URL','http://172.23.101.205:8080/Youxuan/Homeinns.EBusiness-Core/_git/Homeinns.EBusiness-Core')
map.put('SIT_PREVIEW_URL','http://172.23.216.91:31015')
map.put('UAT_PREVIEW_URL','http://192.168.210.34:31015')
map.put('PROD_PREVIEW_URL','http://172.23.101.213:31015')

map.put('DEPLOY_ENV','sit\nprod')
map.put('DEPLOY_VERSION','1.0')
map.put('REGISTRY_URL','http://172.23.101.176')

netCoreDeployToK8s(map)

