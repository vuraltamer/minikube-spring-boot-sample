# minikube-spring-boot-sample
minikube spring-boot embedded mongo

docker login -u vuraltestdocker -p <password> 
cd /<spring-boot-project-path>  
sudo systemctl restart docker                                                                            <!-- start docker -->
sudo docker images                                                                                       <!-- list docker images -->
sudo docker build -t vuraltestdocker/vspringtest:latest -t vuraltestdocker/vspringtest .                 <!-- build your project for http://hub.docker.com/ -->
sudo docker push vuraltestdocker/vspringtest:latest                                                      <!-- push your project to http://hub.docker.com/ -->
sudo docker run -p 8080:8080 vuraltestdocker/vspringtest                                                 <!-- run your docker image -->


minikube ssh                                                                                             
minikube start                                                                                           <!-- -->
minikube dashboard                                                                                       <!-- -->

kubectl run vspringtest --image=vuraltestdocker/vspringtest:latest --port 8080 --image-pull-policy=Never <!-- -->
kubectl get pods                                                                                         <!-- -->
kubectl create service clusterip vspringtest --tcp=8080:8080 --dry-run=client -o=yaml >> deployment.yaml <!-- -->
kubectl get services                                                                                     <!-- -->
kubectl create deployment vspringtest --image=vuraltestdocker/vspringtest:latest                         <!-- -->
kubectl get deployments                                                                                  <!-- -->
kubectl expose deployment vspringtest --type=NodePort --port=8080                                        <!-- -->
kubectl get service vspringtest                                                                          <!-- -->
minikube service vspringtest --url                                                                       <!-- -->
