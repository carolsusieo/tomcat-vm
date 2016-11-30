Vagrant.configure(2) do |config|

  # A standard Ubuntu 16 

  # For more boxes, you can look at https://atlas.hashicorp.com/boxes/search

  config.vm.box = "gbarbieru/xenial"

  config.vm.provision "shell", path: "vagrant_provision.sh"


  # Create a private network, which allows host-only access to the machine

  # using a specific IP.

  config.vm.network "private_network", ip: "192.168.33.10"

  # Disable the new default behavior introduced in Vagrant 1.7, to
  # ensure that all Vagrant machines will use the same SSH key pair.
  # See https://github.com/mitchellh/vagrant/issues/5005
  config.ssh.insert_key = false

  config.vm.provision "ansible" do |ansible|
    ansible.verbose = "v"
    ansible.playbook = "playbook.yml"
  end

end
