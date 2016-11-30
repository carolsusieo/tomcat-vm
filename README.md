

Creating your own tomcat server with two applets using Vagrant and Ansible
========
This source code repository includes configuration files to materialize an _entire_ server implementation with all project build artifacts in a single virtual machine (VM) image from scratch, allowing you to quickly bootstrap your own local copy of the project. The server will be completely encapsulated within the created VM image.  The built-in settings support creation of a *VirtualBox*-based image on Ubuntu Linux, though with tuning of the base image you should be able to create images suitable for other hypervisors and cloud-based IaaS providers such as VMware and Amazon Web Services (AWS), respectively.

Dependencies
----

 * VirtualBox
 * Vagrant
 * Ansible

Creating Your VM
----
vagrant up

Your new server environment should now be running in a headless virtual machine on your local computer. The following step are performed automatically for you within the VM sandbox environment:

 * A complete Ubuntu 12.04 Server VM is launched in headless mode, bridged to whatever host network interface you've selected.
 * ip address assigned is: "192.168.33.10"
 * Oracle Java 7 is installed.
 * Apache 2 is installed
 * Tomcat 7 is installed and configured as a system service.
 * Git and Maven are installed
 * uses Maven to create a 2 spring app war files, install them in tomcat and restart tomcat
	access app from browser : 192.168.33.10:8080/hello-spring
	access second app :192.168.33.10:8080/hello-carol
 
Tomcat will now be running on the VM on port 8080 without the management GUI available.

 
Screenshots
----

Advanced Configuration
----
The Vagrant documentation is the best place to start, but a few more commands of note are:

    vagrant ssh # Command-line access to the VM.
    vagrant destoy # Shuts down and completely destroys the VM.


Credits
----
https://dzone.com/articles/vagrant