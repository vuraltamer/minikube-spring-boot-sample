# minikube-spring-boot-sample
minikube spring-boot embedded mongo

docker login -u vuraltestdocker -p <password> 
cd /<spring-boot-project-path>  
sudo systemctl restart docker                                                                            #start docker
sudo docker images                                                                                       #list docker images
sudo docker build -t vuraltestdocker/vspringtest:latest -t vuraltestdocker/vspringtest .                 #build your project for http://hub.docker.com/
sudo docker push vuraltestdocker/vspringtest:latest                                                      #push your project to http://hub.docker.com/
sudo docker run -p 8080:8080 vuraltestdocker/vspringtest                                                 #run your docker image


minikube ssh                                                                                             # 
minikube start                                                                                           #
minikube dashboard                                                                                       # show minikube dashboard

kubectl run vspringtest --image=vuraltestdocker/vspringtest:latest --port 8080 --image-pull-policy=Never # init and run minikube pod from docker
kubectl get pods                                                                                         # show pods
kubectl create service clusterip vspringtest --tcp=8080:8080 --dry-run=client -o=yaml >> deployment.yaml # create minikube service clusterip
kubectl get services                                                                                     # show services
kubectl create deployment vspringtest --image=vuraltestdocker/vspringtest:latest                         # start minikube service deployment
kubectl get deployments                                                                                  # show deployments
kubectl expose deployment vspringtest --type=NodePort --port=8080                                        # ip and port make public
kubectl get service vspringtest                                                                          # show servis detail
minikube service vspringtest --url                                                                       # show servis url

    
![alt text](https://github.com/vuraltamer/spring-boot-mvc-mongodb-sample/blob/master/screenshots/Screenshot%20from%202019-02-24%2021-23-58.png)
    
    ![alt text](https://github.com/vuraltamer/minikube-spring-boot-sample/blob/main/images/vt_minikube_1.png)
    ![alt text](https://github.com/vuraltamer/minikube-spring-boot-sample/blob/main/images/vt_minikube_2.png)
    ![alt text](https://github.com/vuraltamer/minikube-spring-boot-sample/blob/main/images/vt_minikube_3.png)
    ![alt text](https://github.com/vuraltamer/minikube-spring-boot-sample/blob/main/images/vt_minikube_4.png)
    ![alt text](https://github.com/vuraltamer/minikube-spring-boot-sample/blob/main/images/vt_minikube_5.png)
