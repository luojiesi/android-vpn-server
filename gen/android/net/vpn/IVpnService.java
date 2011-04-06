/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/luojiesi/program/android-vpn-server/src/android/net/vpn/IVpnService.aidl
 */
package android.net.vpn;
/**
 * Interface to access a VPN service.
 * {@hide}
 */
public interface IVpnService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.vpn.IVpnService
{
private static final java.lang.String DESCRIPTOR = "android.net.vpn.IVpnService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.vpn.IVpnService interface,
 * generating a proxy if needed.
 */
public static android.net.vpn.IVpnService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.vpn.IVpnService))) {
return ((android.net.vpn.IVpnService)iin);
}
return new android.net.vpn.IVpnService.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_connect:
{
data.enforceInterface(DESCRIPTOR);
android.net.vpn.VpnProfile _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.vpn.VpnProfile.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.connect(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disconnect:
{
data.enforceInterface(DESCRIPTOR);
this.disconnect();
reply.writeNoException();
return true;
}
case TRANSACTION_checkStatus:
{
data.enforceInterface(DESCRIPTOR);
android.net.vpn.VpnProfile _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.vpn.VpnProfile.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.checkStatus(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.vpn.IVpnService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
     * Sets up the VPN connection.
     * @param profile the profile object
     * @param username the username for authentication
     * @param password the corresponding password for authentication
     */
public boolean connect(android.net.vpn.VpnProfile profile, java.lang.String username, java.lang.String password) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(username);
_data.writeString(password);
mRemote.transact(Stub.TRANSACTION_connect, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Tears down the VPN connection.
     */
public void disconnect() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disconnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Makes the service broadcast the connectivity state.
     */
public void checkStatus(android.net.vpn.VpnProfile profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((profile!=null)) {
_data.writeInt(1);
profile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_checkStatus, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_connect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_disconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_checkStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
/**
     * Sets up the VPN connection.
     * @param profile the profile object
     * @param username the username for authentication
     * @param password the corresponding password for authentication
     */
public boolean connect(android.net.vpn.VpnProfile profile, java.lang.String username, java.lang.String password) throws android.os.RemoteException;
/**
     * Tears down the VPN connection.
     */
public void disconnect() throws android.os.RemoteException;
/**
     * Makes the service broadcast the connectivity state.
     */
public void checkStatus(android.net.vpn.VpnProfile profile) throws android.os.RemoteException;
}
