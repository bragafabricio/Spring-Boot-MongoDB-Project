# Social Network Users CRUD with Spring Boot and MongoDB


![GitHub repo size](https://img.shields.io/github/repo-size/bragafabricio/Spring-Boot-MongoDB-Project?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/bragafabricio/Spring-Boot-MongoDB-Project?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/bragafabricio/Spring-Boot-MongoDB-Project?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/bragafabricio/Spring-Boot-MongoDB-Project?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/bragafabricio/Spring-Boot-MongoDB-Project?style=for-the-badge)

This is a project for studying Spring Boot and MongoDB. It has endpoints for basic CRUD operations for users, and also has queries for searching for posts through parameters. .

## Project structure
<img src="https://github.com/bragafabricio/Spring-Boot-MongoDB-Project/blob/master/img/structure.png" alt="project structe">


## UML Design
<img src="https://github.com/bragafabricio/Spring-Boot-MongoDB-Project/blob/master/img/uml.png" alt="uml design">

## Operations

### Retrieve all users   
**GET method:** 
localhost:8080/users   
http status: 200

### Retrieve all users   
**GET method:**    
localhost:8080/users       
http status: 200

### Retrieve user by id   
**GET method:**  
localhost:8080/users/{id}   
http status: 200 or 404

### Insert user   
**POST method:**  
localhost:8080/users    
http status: 202    
Body:   
```
  {
     "name": "name",
     "email": "email@email.com"
  }
```   
Obs: Header will provide new user’s id.


### Update user
**PUT method:**   
localhost:8080/users/{id}   
http status: 204 or 404    
Body:    
```
  {
     "name": "UpdatedName",
     "email": "UpdatedEmail@email.com"
  }
```

### Checking user's posts    
**GET method:**   
localhost:8080/users/{id}/posts    
http status: 200 or 404    

### Get a post by it’s id
**GET method:** 
localhost:8080/posts/{id}   
http status: 200 or 404    

### Search a post by it’s title    
**GET method:**   
localhost:8080/posts/titlesearch?text=_viagem_   
http status: 200   
text should be URI encoded (encodeURI(“text”))   

### Search a post by any of it’s text content and a Date gap
**GET method:**   
localhost:8080/posts/fullsearch?text=_string_&minDate=_yyyy_-_MM_-_dd_&maxDate=_yyyy_-_MM_-_dd_   
http status: 200    
text should be URI encoded (encodeURI(“text”)), fields minDate and maxDate are optional    


[⬆ Back to top](#Social-Network-Users-CRUD-with-Spring-Boot-and-MongoDB)<br>
