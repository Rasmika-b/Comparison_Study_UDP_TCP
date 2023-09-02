# TCP

- TCP (Transmission Control Protocol) is a standard that defines how to establish and 
maintain a network conversation through which application programs can exchange data. 
TCP works with the Internet Protocol (IP), which defines how computers send 
packets of data to each other. Together, TCP and IP are the basic rules defining the Internet.

- TCP is a connection-oriented protocol, which means a connection is established and 
maintained until the application programs at each end have finished exchanging messages. 
It determines how to break application data into packets that networks can deliver, sends 
packets to and accepts packets from the network layer, manages flow control and --
because it is meant to provide error-free data transmission -- handles retransmission of 
dropped or garbled packets and acknowledges all packets that arrive.

- For example, when a web server sends an HTML file to a client, it uses the hypertext 
transfer protocol (HTTP) to do so. The HTTP program layer asks the TCP layer to set up the 
connection and send the file. The TCP stack divides the file into data packets, numbers them 
and then forwards them individually to the IP layer for delivery. Although each packet in the 
transmission has the same source and destination IP address, packets may be sent along 
multiple routes. The TCP program layer in the client computer waits until all the packets 
have arrived, then acknowledges those it receives and asks for the re-transmission of any it 
does not -- based on missing packet numbers. The TCP layer then assembles the packets 
into a file and delivers the file to the receiving application.

TCP Model:

<img src="https://github.com/Rasmika-b/Comparison_Study_UDP_TCP/assets/60094457/1ed83e99-f4eb-4b7c-899a-ee7719a8149c" width="300"/>

What TCP is used for: 

- TCP is used for organizing data in a way that ensures the secure 
transmission between the server and client. It guarantees the integrity of data sent over the 
network, regardless of the amount. For this reason, it is used to transmit data from other 
higher-level protocols that require all transmitted data to arrive. Examples include:

  - Secure Shell (SSH), File Transfer Protocol (FTP), Telnet: For peer-to-peer file sharing, and, 
in Telnet's case, logging into another user's computer to access a file.
  - Simple Mail Transfer Protocol (SMTP), Post Office Protocol (POP), Internet Message 
Access Protocol (IMAP): For sending and receiving email
  - HTTP: For web access

Why TCP is important: 

- TCP is important because it establishes the rules and standard 
procedures for the way information is communicated over the internet. It is the foundation 
for the internet as it exists today and ensures that data transmission is carried out 
uniformly, regardless of the location, hardware or software involved.

- For this reason, it is flexible and highly scalable, meaning new protocols can be introduced to it and it will 
accommodate them. It is also non-proprietary, meaning no one person or company owns it.
