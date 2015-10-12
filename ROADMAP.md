Josmin Feature Roadmap / TODO
========

Core Features
--------

* Change system Hostname
* Change DNS servers (modify /etc/resolve)
* Change root/user passwords
* Add | Edit | Update users
* Install / manage / Update Packages
* Start / stop / manage System Services
* Manage Databases like MySQL / Postgresql
	* Create new database
	* Backup/restore a database
	* Manage database users
* List / attach / detach disks
* Fetch system resource stats (load/uptime, ram/disk usage, network io)
* Fetch/download System log(s)
* Shutdown / restart system
* List system processes and provide option to kill a process


Virtualization Features
---------------
* Use libvirt-java API to provision/list/manage KVM virtual machines


Container Features
---------------
* Use system APIs to provision/list/manage namespace/cgroup based containers.
* Explore if libvirt-java can be used to implement containers using "lxc" driver



Virtual/Shared Hosting Features
---------------

Virtual hosting features are implemented by calling (via API) an appropriate web hosting manager or control panel.

Default implementation for open source Virtualmin control panel is provided. Other CP implementation can be plugged-in.

* Provision/delete a new domain
* Provision DNS records
* Provision Mail a/c
* Install/manage web apps like WordPress, Magento etc









