# uees-sd-2020-repo02
# Integrantes
-Arriaga Josué

-Yupangue Jorge

# Requerimientos previos
Se instalo por consola  los aplicativos jre y jdk con el comando “sudo apt install default-jre” y “sudo apt install default-jdk”  respectivamente.
Instalacion de Git con el comando “sudo apt install git”.

# Implementación del modelo cliente-servidor

1. Clonacion del repositorio hecho el Github con el comando "clone"[nombre de repositorio]
2. Configuracion de ip de cada maquina virtual, para eso se hizo uso del comando "sudo ifconfig enp0s8" [nueva direccion ip]
3. Modificacion del archivo  TCPClientStructureData.java la cual se ingresa la ip de la maquina virtual que realizara el papel de servidor.
4. Se ejecuto las clases TCPServerStructuredData.java  y TCPClientStructuredData.java en cada maquina virtual con el comando java por delante: ejemplo java TCPClientStructuredData.java
5. Por ultimo se visualizará un random de X, la cual se repetira las veces que la clase TCPClientStructureData.java haya sido ejecutada.


# Referencias
https://github.com/thomasWeise/distributedComputingExamples/tree/master/sockets/java



