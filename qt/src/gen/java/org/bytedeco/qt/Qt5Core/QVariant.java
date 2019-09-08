// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.qt.global.Qt5Core.*;

// Parsed from QtCore/qvariant.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Core.class)
public class QVariant extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QVariant(Pointer p) { super(p); }

    

    public QVariant() { super((Pointer)null); allocate(); }
    private native void allocate();
    public QVariant(int typeId, @Const Pointer copy) { super((Pointer)null); allocate(typeId, copy); }
    private native void allocate(int typeId, @Const Pointer copy);
    public QVariant(int typeId, @Const Pointer copy, @Cast("unsigned int") int flags) { super((Pointer)null); allocate(typeId, copy, flags); }
    private native void allocate(int typeId, @Const Pointer copy, @Cast("unsigned int") int flags);
    public QVariant(@Const @ByRef QVariant other) { super((Pointer)null); allocate(other); }
    private native void allocate(@Const @ByRef QVariant other);

// #ifndef QT_NO_DATASTREAM
// #endif

    public QVariant(int i) { super((Pointer)null); allocate(i); }
    private native void allocate(int i);
    public QVariant(long ll) { super((Pointer)null); allocate(ll); }
    private native void allocate(long ll);
    public QVariant(@Cast("bool") boolean b) { super((Pointer)null); allocate(b); }
    private native void allocate(@Cast("bool") boolean b);
    public QVariant(double d) { super((Pointer)null); allocate(d); }
    private native void allocate(double d);
    public QVariant(float f) { super((Pointer)null); allocate(f); }
    private native void allocate(float f);
// #ifndef QT_NO_CAST_FROM_ASCII
    public QVariant(@Cast("const char*") BytePointer str) { super((Pointer)null); allocate(str); }
    private native @Deprecated void allocate(@Cast("const char*") BytePointer str);
    public QVariant(String str) { super((Pointer)null); allocate(str); }
    private native @Deprecated void allocate(String str);
// #endif

    public QVariant(@Const @ByRef QByteArray bytearray) { super((Pointer)null); allocate(bytearray); }
    private native void allocate(@Const @ByRef QByteArray bytearray);
    public QVariant(@Const @ByRef QString string) { super((Pointer)null); allocate(string); }
    private native void allocate(@Const @ByRef QString string);
// #ifndef QT_NO_GEOM_VARIANT
    public QVariant(@Const @ByRef QSize size) { super((Pointer)null); allocate(size); }
    private native void allocate(@Const @ByRef QSize size);
// #endif
// #ifndef QT_NO_REGEXP
// #endif // QT_NO_REGEXP
// #if QT_CONFIG(regularexpression)
// #endif // QT_CONFIG(regularexpression)
// #ifndef QT_BOOTSTRAPPED
// #endif // QT_BOOTSTRAPPED
// #if QT_CONFIG(itemmodel)
// #endif

    public native @ByRef @Name("operator =") QVariant put(@Const @ByRef QVariant other);
// #ifdef Q_COMPILER_RVALUE_REFS
// #endif

    public native void swap(@ByRef QVariant other);
    public native int userType();
    public native @Cast("const char*") BytePointer typeName();

    public native @Cast("bool") boolean canConvert(int targetTypeId);
    public native @Cast("bool") boolean convert(int targetTypeId);

    public native @Cast("bool") boolean isValid();
    public native @Cast("bool") boolean isNull();

    public native void clear();

    public native void detach();
    public native @Cast("bool") boolean isDetached();

    public native int toInt(@Cast("bool*") BoolPointer ok/*=nullptr*/);
    public native int toInt();
    public native int toInt(@Cast("bool*") boolean[] ok/*=nullptr*/);
    public native @Cast("unsigned int") int toUInt(@Cast("bool*") BoolPointer ok/*=nullptr*/);
    public native @Cast("unsigned int") int toUInt();
    public native @Cast("unsigned int") int toUInt(@Cast("bool*") boolean[] ok/*=nullptr*/);
    public native long toLongLong(@Cast("bool*") BoolPointer ok/*=nullptr*/);
    public native long toLongLong();
    public native long toLongLong(@Cast("bool*") boolean[] ok/*=nullptr*/);
    public native @Cast("unsigned long long") long toULongLong(@Cast("bool*") BoolPointer ok/*=nullptr*/);
    public native @Cast("unsigned long long") long toULongLong();
    public native @Cast("unsigned long long") long toULongLong(@Cast("bool*") boolean[] ok/*=nullptr*/);
    public native @Cast("bool") boolean toBool();
    public native double toDouble(@Cast("bool*") BoolPointer ok/*=nullptr*/);
    public native double toDouble();
    public native double toDouble(@Cast("bool*") boolean[] ok/*=nullptr*/);
    public native float toFloat(@Cast("bool*") BoolPointer ok/*=nullptr*/);
    public native float toFloat();
    public native float toFloat(@Cast("bool*") boolean[] ok/*=nullptr*/);
    public native double toReal(@Cast("bool*") BoolPointer ok/*=nullptr*/);
    public native double toReal();
    public native double toReal(@Cast("bool*") boolean[] ok/*=nullptr*/);
    public native @ByVal QByteArray toByteArray();
    public native @ByVal @Name("toString") QString toQString();

// #ifndef QT_NO_GEOM_VARIANT
    public native @ByVal QSize toSize();
// #endif
// #ifndef QT_NO_REGEXP
// #endif // QT_NO_REGEXP
// #if QT_CONFIG(regularexpression)
// #endif // QT_CONFIG(regularexpression)
// #ifndef QT_BOOTSTRAPPED
// #endif // QT_BOOTSTRAPPED
// #if QT_CONFIG(itemmodel)
// #endif

// #ifndef QT_NO_DATASTREAM
// #endif
    
    
    
}
