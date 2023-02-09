# Information Management Server
Java Spring Backend server for Information Management System.

# Project Abstract

Information Mangement is a system to share the information between users according to the categories.
Functionalities to implement is like following:

* User Authentication
* 3 Main Channels (Experience, Job channel, Interview Questions)
* Add private / public channels

# APIs
/register

/login

/user

/channel

/channel/:id

**Register user**
----
   Returns json data about the registered user.

* **URL**

  /register

* **Scope**

  `PUBLIC`

* **Method:**

  `POST`
  
* **URL Params**

   None

* **Data Params**

  `email: String` <br />
  `password: String`


**Login user**
----
   Returns json data about the logged user, without password and with a **webtoken**.

* **URL**

  /login
  
* **Scope**

  `PUBLIC`

* **Method:**

  `POST`
  
* **URL Params**

   None

* **Data Params**

  `email: String` <br />
  `password: String`

**Get all channels / post a new channel**
----
   Returns json data about the all the channels stored.

* **URL**

  /channel
  
* **Scope**

  `PRIVATE`

* **Method:**

  `GET` `POST`
  
* **URL Params**

   None

  
**Get / post / put / delete channel info**
----
   Returns json data about the channel info.

* **URL**

  /channel/:id

* **Scope**

  `PRIVATE`

* **Method:**

  `GET`  `POST`  `PUT`  `DELETE`
  
* **URL Params**

   None



**Get / Put / Delete User info**
----
   Returns json data about the user information.

* **URL**

  /user
  
* **Scope**

  `PRIVATE`

* **Method:**

  `POST`  `GET`  `PUT`
  
* **URL Params**

   None
