//
// Generated by protoc, do not edit by hand.
//
package org.apache.activemq.console.command.store.proto;


public class MapEntryPB implements org.fusesource.hawtbuf.proto.PBMessageFactory<MapEntryPB.Bean, MapEntryPB.Buffer> {

   public static final MapEntryPB FACTORY = new MapEntryPB();
   public static final org.fusesource.hawtbuf.proto.PBMessageFramedCodec<Buffer> FRAMED_CODEC = new org.fusesource.hawtbuf.proto.PBMessageFramedCodec<Buffer>(FACTORY);
   public static final org.fusesource.hawtbuf.proto.PBMessageUnframedCodec<Buffer> UNFRAMED_CODEC = new org.fusesource.hawtbuf.proto.PBMessageUnframedCodec<Buffer>(FACTORY);

   public Bean create()  {
      return new Bean();
   }

   public Bean parseUnframed(org.fusesource.hawtbuf.proto.CodedInputStream data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException, java.io.IOException {
      return new Bean().mergeUnframed(data);
   }

   public Bean parseUnframed(java.io.InputStream data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException, java.io.IOException {
      return parseUnframed(new org.fusesource.hawtbuf.proto.CodedInputStream(data));
   }

   public Buffer parseUnframed(org.fusesource.hawtbuf.Buffer data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException {
      return new Buffer(data);
   }

   public Buffer parseUnframed(byte[] data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException {
      return parseUnframed(new org.fusesource.hawtbuf.Buffer(data));
   }

   public Buffer parseFramed(org.fusesource.hawtbuf.proto.CodedInputStream data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException, java.io.IOException {
      int length = data.readRawVarint32();
      int oldLimit = data.pushLimit(length);
      Buffer rc = parseUnframed(data.readRawBytes(length));
      data.popLimit(oldLimit);
      return rc;
   }

   public Buffer parseFramed(org.fusesource.hawtbuf.Buffer data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException {
      try {
         org.fusesource.hawtbuf.proto.CodedInputStream input = new org.fusesource.hawtbuf.proto.CodedInputStream(data);
         Buffer rc = parseFramed(input);
         input.checkLastTagWas(0);
         return rc;
      } catch (org.fusesource.hawtbuf.proto.InvalidProtocolBufferException e) {
         throw e;
      } catch (java.io.IOException e) {
         throw new RuntimeException("An IOException was thrown (should never happen in this method).", e);
      }
   }

   public Buffer parseFramed(byte[] data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException {
      return parseFramed(new org.fusesource.hawtbuf.Buffer(data));
   }

   public Buffer parseFramed(java.io.InputStream data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException, java.io.IOException {
      return parseUnframed(org.fusesource.hawtbuf.proto.MessageBufferSupport.readFrame(data));
   }

   public interface Getter extends org.fusesource.hawtbuf.proto.PBMessage<MapEntryPB.Bean, MapEntryPB.Buffer> {

      // required bytes key = 1;
      public boolean hasKey();
      public org.fusesource.hawtbuf.Buffer getKey();
      // optional bytes value = 2;
      public boolean hasValue();
      public org.fusesource.hawtbuf.Buffer getValue();
      public Bean copy();
      public Buffer freeze();
      public java.lang.StringBuilder toString(java.lang.StringBuilder sb, String prefix);
   }

   static public final class Bean implements Getter {

      Buffer frozen;
      Bean bean;

      public Bean() {
         this.bean = this;
      }

      public Bean(Bean copy) {
         this.bean = copy;
      }

      public Bean copy() {
         return new Bean(bean);
      }

      public boolean frozen() {
         return frozen!=null;
      }

      public Buffer freeze() {
         if( frozen==null ) {
            frozen = new Buffer(bean);
            assert deepFreeze();
         }
         return frozen;
      }

      private boolean deepFreeze() {
         frozen.serializedSizeUnframed();
         return true;
      }

      private void copyCheck() {
         assert frozen==null : org.fusesource.hawtbuf.proto.MessageBufferSupport.FORZEN_ERROR_MESSAGE;
         if (bean != this) {
            copy(bean);
         }
      }

      private void copy(Bean other) {
         this.bean = this;
         this.f_key = other.f_key;
         this.f_value = other.f_value;
      }

      // required bytes key = 1;
      private org.fusesource.hawtbuf.Buffer f_key = null;

      public boolean hasKey() {
         return bean.f_key!=null;
      }

      public org.fusesource.hawtbuf.Buffer getKey() {
         return bean.f_key;
      }

      public Bean setKey(org.fusesource.hawtbuf.Buffer key) {
         copyCheck();
         this.f_key = key;
         return this;
      }

      public void clearKey() {
         copyCheck();
         this.f_key = null;
      }

      // optional bytes value = 2;
      private org.fusesource.hawtbuf.Buffer f_value = null;

      public boolean hasValue() {
         return bean.f_value!=null;
      }

      public org.fusesource.hawtbuf.Buffer getValue() {
         return bean.f_value;
      }

      public Bean setValue(org.fusesource.hawtbuf.Buffer value) {
         copyCheck();
         this.f_value = value;
         return this;
      }

      public void clearValue() {
         copyCheck();
         this.f_value = null;
      }

      public String toString() {
         return toString(new java.lang.StringBuilder(), "").toString();
      }

      public java.lang.StringBuilder toString(java.lang.StringBuilder sb, String prefix) {
         if(  hasKey() ) {
            sb.append(prefix+"key: ");
            sb.append(getKey());
            sb.append("\n");
         }
         if(  hasValue() ) {
            sb.append(prefix+"value: ");
            sb.append(getValue());
            sb.append("\n");
         }
         return sb;
      }

      public Bean mergeUnframed(java.io.InputStream input) throws java.io.IOException {
         return mergeUnframed(new org.fusesource.hawtbuf.proto.CodedInputStream(input));
      }

      public Bean mergeUnframed(org.fusesource.hawtbuf.proto.CodedInputStream input) throws java.io.IOException {
         copyCheck();
         while (true) {
            int tag = input.readTag();
            if ((tag & 0x07) == 4) {
               return this;
            }
            switch (tag) {
            case 0:
               return this;
            default: {
               input.skipField(tag);
               break;
            }
            case 10:
               setKey(input.readBytes());
               break;
            case 18:
               setValue(input.readBytes());
               break;
            }
         }
      }
      public boolean equals(Object obj) {
         if( obj==this )
            return true;
         
         if( obj==null || obj.getClass()!=Bean.class )
            return false;
         
         return equals((Bean)obj);
      }
      
      public boolean equals(Bean obj) {
         if (hasKey() ^ obj.hasKey() ) 
            return false;
         if (hasKey() && ( !getKey().equals(obj.getKey()) ))
            return false;
         if (hasValue() ^ obj.hasValue() ) 
            return false;
         if (hasValue() && ( !getValue().equals(obj.getValue()) ))
            return false;
         return true;
      }
      
      public int hashCode() {
         int rc=2066384;
         if (hasKey()) {
            rc ^= ( 75327^getKey().hashCode() );
         }
         if (hasValue()) {
            rc ^= ( 82420049^getValue().hashCode() );
         }
         return rc;
      }
      
      public Bean mergeFrom(Getter other) {
         copyCheck();
         if (other.hasKey()) {
            setKey(other.getKey());
         }
         if (other.hasValue()) {
            setValue(other.getValue());
         }
         return this;
      }

      public void clear() {
         clearKey();
         clearValue();
      }

      public void readExternal(java.io.DataInput in) throws java.io.IOException {
         assert frozen==null : org.fusesource.hawtbuf.proto.MessageBufferSupport.FORZEN_ERROR_MESSAGE;
         bean = this;
         frozen = null;
         {
            int size = in.readInt();
            if( size>=0 ) {
               byte b[] = new byte[size];
               in.readFully(b);
               f_key = new org.fusesource.hawtbuf.Buffer(b);
            } else {
               f_key = null;
            }
         }
         {
            int size = in.readInt();
            if( size>=0 ) {
               byte b[] = new byte[size];
               in.readFully(b);
               f_value = new org.fusesource.hawtbuf.Buffer(b);
            } else {
               f_value = null;
            }
         }
      }

      public void writeExternal(java.io.DataOutput out) throws java.io.IOException {
         if( bean.f_key!=null ) {
            out.writeInt(bean.f_key.getLength());
            out.write(bean.f_key.getData(), bean.f_key.getOffset(), bean.f_key.getLength());
         } else {
            out.writeInt(-1);
         }
         if( bean.f_value!=null ) {
            out.writeInt(bean.f_value.getLength());
            out.write(bean.f_value.getData(), bean.f_value.getOffset(), bean.f_value.getLength());
         } else {
            out.writeInt(-1);
         }
      }

   }

   static public final class Buffer implements org.fusesource.hawtbuf.proto.MessageBuffer<MapEntryPB.Bean, MapEntryPB.Buffer>, Getter {

      private Bean bean;
      private org.fusesource.hawtbuf.Buffer buffer;
      private int size=-1;
      private int hashCode;

      private Buffer(org.fusesource.hawtbuf.Buffer buffer) {
         this.buffer = buffer;
      }

      private Buffer(Bean bean) {
         this.bean = bean;
      }

      public Bean copy() {
         return bean().copy();
      }

      public Buffer freeze() {
         return this;
      }

      private Bean bean() {
         if (bean == null) {
            try {
               bean = new Bean().mergeUnframed(new org.fusesource.hawtbuf.proto.CodedInputStream(buffer));
               bean.frozen=this;
            } catch (org.fusesource.hawtbuf.proto.InvalidProtocolBufferException e) {
               throw new RuntimeException(e);
            } catch (java.io.IOException e) {
               throw new RuntimeException("An IOException was thrown (should never happen in this method).", e);
            }
         }
         return bean;
      }

      public String toString() {
         return bean().toString();
      }

      public java.lang.StringBuilder toString(java.lang.StringBuilder sb, String prefix) {
         return bean().toString(sb, prefix);
      }

      // required bytes key = 1;
      public boolean hasKey() {
         return bean().hasKey();
      }

      public org.fusesource.hawtbuf.Buffer getKey() {
         return bean().getKey();
      }

      // optional bytes value = 2;
      public boolean hasValue() {
         return bean().hasValue();
      }

      public org.fusesource.hawtbuf.Buffer getValue() {
         return bean().getValue();
      }

      public org.fusesource.hawtbuf.Buffer toUnframedBuffer() {
         if( buffer !=null ) {
            return buffer;
         }
         return org.fusesource.hawtbuf.proto.MessageBufferSupport.toUnframedBuffer(this);
      }

      public org.fusesource.hawtbuf.Buffer toFramedBuffer() {
         return org.fusesource.hawtbuf.proto.MessageBufferSupport.toFramedBuffer(this);
      }

      public byte[] toUnframedByteArray() {
         return toUnframedBuffer().toByteArray();
      }

      public byte[] toFramedByteArray() {
         return toFramedBuffer().toByteArray();
      }

      public void writeFramed(org.fusesource.hawtbuf.proto.CodedOutputStream output) throws java.io.IOException {
         output.writeRawVarint32(serializedSizeUnframed());
         writeUnframed(output);
      }

      public void writeFramed(java.io.OutputStream output) throws java.io.IOException {
         org.fusesource.hawtbuf.proto.CodedOutputStream codedOutput = new org.fusesource.hawtbuf.proto.CodedOutputStream(output);
         writeFramed(codedOutput);
         codedOutput.flush();
      }

      public void writeUnframed(java.io.OutputStream output) throws java.io.IOException {
         org.fusesource.hawtbuf.proto.CodedOutputStream codedOutput = new org.fusesource.hawtbuf.proto.CodedOutputStream(output);
         writeUnframed(codedOutput);
         codedOutput.flush();
      }

      public void writeUnframed(org.fusesource.hawtbuf.proto.CodedOutputStream output) throws java.io.IOException {
         if (buffer == null) {
            int size = serializedSizeUnframed();
            buffer = output.getNextBuffer(size);
            org.fusesource.hawtbuf.proto.CodedOutputStream original=null;
            if( buffer == null ) {
               buffer = new org.fusesource.hawtbuf.Buffer(new byte[size]);
               original = output;
               output = new org.fusesource.hawtbuf.proto.CodedOutputStream(buffer);
            }
            output.writeBytes(1, bean.getKey());
            if (bean.hasValue()) {
               output.writeBytes(2, bean.getValue());
            }
            if( original !=null ) {
               output.checkNoSpaceLeft();
               output = original;
               output.writeRawBytes(buffer);
            }
         } else {
            output.writeRawBytes(buffer);
         }
      }

      public int serializedSizeFramed() {
         int t = serializedSizeUnframed();
         return org.fusesource.hawtbuf.proto.CodedOutputStream.computeRawVarint32Size(t) + t;
      }

      public int serializedSizeUnframed() {
         if (buffer != null) {
            return buffer.length;
         }
         if (size != -1)
            return size;

         size = 0;
         size += org.fusesource.hawtbuf.proto.CodedOutputStream.computeBytesSize(1, getKey());
         if (hasValue()) {
            size += org.fusesource.hawtbuf.proto.CodedOutputStream.computeBytesSize(2, getValue());
         }
         return size;
      }

      public boolean equals(Object obj) {
         if( obj==this )
            return true;
         
         if( obj==null || obj.getClass()!=Buffer.class )
            return false;
         
         return equals((Buffer)obj);
      }
      
      public boolean equals(Buffer obj) {
         return toUnframedBuffer().equals(obj.toUnframedBuffer());
      }
      
      public int hashCode() {
         if( hashCode==0 ) {
         hashCode=2000715872 ^ toUnframedBuffer().hashCode();
         }
         return hashCode;
      }
      
      public boolean frozen() {
         return true;
      }
   }

}

