/*
 *	UDPNetwork.java
 */

/*
 * Copyright (c) 2004 by Matthias Pfisterer
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * - Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/*
|<---            this code is formatted to fit into 80 columns             --->|
*/

package org.jsresources.apps.chat;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

import java.net.InetAddress;
import java.net.DatagramSocket;



public class UDPNetwork
extends BaseNetwork
{
	public UDPNetwork(MasterModel masterModel)
	{
	    super(masterModel);
// 		try
// 		{
// 			m_serverSocket = new ServerSocket(getPort());
// 			m_serverSocket.setSoTimeout(2000);
// 		}
// 		catch (IOException e)
// 		{
// 			Debug.out(e);
// 		}
	}


	public void connect(InetAddress addr)
	{
// 		try
// 		{
// 			m_commSocket = new Socket(addr, getPort());
// 		}
// 		catch (IOException e)
// 		{
// 			Debug.out(e);
// 		}
	}



	public void disconnect()
	{
// 		try
// 		{
// 			m_commSocket.close();
// 		}
// 		catch (IOException e)
// 		{
// 			Debug.out(e);
// 		}
	}



	public boolean isConnected()
	{
	    return false; //m_commSocket != null && m_commSocket.isConnected();
	}


    public InetAddress getPeer()
	{
	    return null;
	}

	public void setListen(boolean bListen)
	{
	}


	public boolean listen()
	{
// 		try
// 		{
// 			m_commSocket = m_serverSocket.accept();
// 		}
// 		catch (IOException e)
// 		{
// 			Debug.out(e);
// 		}
		return isConnected();
	}


	public InputStream createReceiveStream()
		throws IOException
	{
	    return null; //m_commSocket.getInputStream();
	}


	public OutputStream createSendStream()
		throws IOException
	{
	    return null; //m_commSocket.getOutputStream();
	}
}


/*** UDPNetwork.java ***/
