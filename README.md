# RMI-RPC
Remote Procedure Call (RPC) is a protocol that allows programs to call procedures located on other machines. 

**Remote Interface**
![Remote Interface](https://github.com/bhargavyagnik/RMI-RPC/blob/main/images/clip_image002.png)

**Remote Object and server implementation of interface**
![Remote Interface](https://github.com/bhargavyagnik/RMI-RPC/blob/main/images/clip_image004.png)

**Client-side program**
![Remote Interface](https://github.com/bhargavyagnik/RMI-RPC/blob/main/images/clip_image006.png)

**Compile the Remote Interface and The Remote Procedure class**
![Remote Interface](https://github.com/bhargavyagnik/RMI-RPC/blob/main/images/clip_image008.png)

**Generate stub and skeleton code using Rmic compiler**

![Remote Interface](https://github.com/bhargavyagnik/RMI-RPC/blob/main/images/clip_image009.png)
**And also starting the rmiregistry using port 1099 (we can use any available port between 0 to 65353)**

**Compile the client file and then start RMI registry**

![Remote Interface](https://github.com/bhargavyagnik/RMI-RPC/blob/main/images/clip_image011.png)

**Execute the server side code first and then the client side… Done !**

![Remote Interface](https://github.com/bhargavyagnik/RMI-RPC/blob/main/images/clip_image012.png)
**Finally we run the client side code to get the Server local time that was obtained using a procedure that would run at server side and return us an object of localTime which would be the local time of server**

![Remote Interface](https://github.com/bhargavyagnik/RMI-RPC/blob/main/images/clip_image014.png)
**So the output can be seen as the current server time as 22:30:07.828094…**
