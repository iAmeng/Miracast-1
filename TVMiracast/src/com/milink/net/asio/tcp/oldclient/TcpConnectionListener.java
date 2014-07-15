
package com.milink.net.asio.tcp.oldclient;

public interface TcpConnectionListener {

    void didConnected(TcpConnection conn);

    void didConnectedFailed(TcpConnection conn);

    void didDisconnect(TcpConnection conn);

    void didRecvBytes(TcpConnection conn, byte[] data);

    void didSendBytes(TcpConnection conn, int size);
}