package com.sun.corba.se.PortableActivationIDL.LocatorPackage;

/**
* com/sun/corba/se/PortableActivationIDL/LocatorPackage/ServerLocationPerORBHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u40/2855/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Tuesday, February 10, 2015 9:55:25 PM PST
*/

public final class ServerLocationPerORBHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerORB value = null;

  public ServerLocationPerORBHolder ()
  {
  }

  public ServerLocationPerORBHolder (com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerORB initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerORBHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerORBHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.LocatorPackage.ServerLocationPerORBHelper.type ();
  }

}
