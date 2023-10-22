# UDP

UDP (User Datagram Protocol) is a communications protocol that is primarily used for establishing low-latency and loss-tolerating connections between applications on the 
internet. It speeds up transmissions by enabling the transfer of data before an agreement is provided by the receiving party. As a result, UDP is beneficial in time-sensitive 
communications, including voice over Internet Protocol (VoIP), domain name system (DNS) lookup, and video or audio playback. UDP is an alternative to Transmission Control Protocol 
(TCP).

User Datagram Protocol features: - User Datagram Protocol has attributes that make it beneficial for use with applications that can tolerate lost data. For example:

- It allows packets to be dropped and received in a different order than they were 
transmitted, making it suitable for real-time applications where latency might be a 
concern.
- It can be used for transaction-based protocols, such as DNS or Network Time Protocol (NTP).
- It can be used where a large number of clients are connected and where real-time error 
correction isn't necessary, such as gaming, voice or video conferencing, and streaming 
media.

UDP header composition: 

UDP uses headers when packaging message data to transfer over network connections. UDP headers contain a set of parameters -- called fields --
defined by the technical specifications of the protocol. The User Datagram Protocol header 
has four fields, each of which is 2 bytes. They are the following:
- source port number, which is the number of the sender;
- destination port number, the port the datagram is addressed to;
- length, the length in bytes of the UDP header and any encapsulated data; and
- checksum, which is used in error checking -- its use is required in IPv6 and optional 
in IPv4.

Model Diagram:

<img src="/img/udp_model.PNG" width="300"/>

How UDP works: 

UDP uses IP to get a datagram from one computer to another. UDP works 
by gathering data in a UDP packet and adding its own header information to the packet. This 
data consists of the source and destination ports to communicate on, the packet length and 
a checksum. After UDP packets are encapsulated in an IP packet, they're sent off to their 
destinations.

Unlike TCP, UDP doesn't guarantee that the packets will get to the right destinations. That 
means that UDP doesn't connect to the receiving computer directly -- which TCP does. 
Rather, it sends the data out and relies on the devices in between the sending and receiving 
computers to correctly get the data where it's supposed to go.

