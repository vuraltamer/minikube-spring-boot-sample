# minikube-spring-boot-sample
minikube spring-boot embedded mongo
 
# login docker
docker login -u vuraltestdocker -p <password> 
# change project directory
cd /<spring-boot-project-path>
# start docker    
sudo systemctl restart docker
# list docker images    
sudo docker images
# build your project for http://hub.docker.com/    
sudo docker build -t vuraltestdocker/vspringtest:latest -t vuraltestdocker/vspringtest .                 
# push your project to http://hub.docker.com/
sudo docker push vuraltestdocker/vspringtest:latest
# run your docker image
sudo docker run -p 8080:8080 vuraltestdocker/vspringtest                                                 

#
minikube ssh                                                                                              
#
minikube start
# show minikube dashboard
minikube dashboard                                                                                       

# init and run minikube pod from docker
kubectl run vspringtest --image=vuraltestdocker/vspringtest:latest --port 8080 --image-pull-policy=Never 
# show pods
kubectl get pods                                                                                         
# create minikube service clusterip
kubectl create service clusterip vspringtest --tcp=8080:8080 --dry-run=client -o=yaml >> deployment.yaml 
# show services
kubectl get services  
# start minikube service deployment
kubectl create deployment vspringtest --image=vuraltestdocker/vspringtest:latest
# show deployments
kubectl get deployments  
# ip and port make public
kubectl expose deployment vspringtest --type=NodePort --port=8080
# show servis detail
kubectl get service vspringtest
# show servis url
minikube service vspringtest --url                                                                       

    
![alt text](https://github.com/vuraltamer/minikube-spring-boot-sample/blob/main/images/vt_minikube_1.png)    
    
![alt text](https://github.com/vuraltamer/minikube-spring-boot-sample/blob/main/images/vt_minikube_2.png)

![alt text](https://github.com/vuraltamer/minikube-spring-boot-sample/blob/main/images/vt_minikube_3.png)

![alt text](https://github.com/vuraltamer/minikube-spring-boot-sample/blob/main/images/vt_minikube_4.png)
  
![alt text](https://github.com/vuraltamer/minikube-spring-boot-sample/blob/main/images/vt_minikube_5.png)
