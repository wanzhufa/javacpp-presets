// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Widgets;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;
import org.bytedeco.qt.Qt5Gui.*;
import static org.bytedeco.qt.global.Qt5Gui.*;

import static org.bytedeco.qt.global.Qt5Widgets.*;

// Parsed from QtWidgets/qpushbutton.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Widgets.class)
public class QPushButton extends QAbstractButton {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QPushButton(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QPushButton(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QPushButton position(long position) {
        return (QPushButton)super.position(position);
    }

    public QPushButton(QWidget parent/*=nullptr*/) { super((Pointer)null); allocate(parent); }
    private native void allocate(QWidget parent/*=nullptr*/);
    public QPushButton() { super((Pointer)null); allocate(); }
    private native void allocate();
    public QPushButton(@Const @ByRef QString text, QWidget parent/*=nullptr*/) { super((Pointer)null); allocate(text, parent); }
    private native void allocate(@Const @ByRef QString text, QWidget parent/*=nullptr*/);
    public QPushButton(@Const @ByRef QString text) { super((Pointer)null); allocate(text); }
    private native void allocate(@Const @ByRef QString text);
    public QPushButton(@Const @ByRef QIcon icon, @Const @ByRef QString text, QWidget parent/*=nullptr*/) { super((Pointer)null); allocate(icon, text, parent); }
    private native void allocate(@Const @ByRef QIcon icon, @Const @ByRef QString text, QWidget parent/*=nullptr*/);
    public QPushButton(@Const @ByRef QIcon icon, @Const @ByRef QString text) { super((Pointer)null); allocate(icon, text); }
    private native void allocate(@Const @ByRef QIcon icon, @Const @ByRef QString text);

    public native @ByVal QSize sizeHint();
    public native @ByVal QSize minimumSizeHint();

    public native @Cast("bool") boolean autoDefault();
    public native void setAutoDefault(@Cast("bool") boolean arg0);
    public native @Cast("bool") boolean isDefault();
    public native void setDefault(@Cast("bool") boolean arg0);

// #if QT_CONFIG(menu)
    public native void setMenu(QMenu menu);
    public native QMenu menu();
// #endif

    public native void setFlat(@Cast("bool") boolean arg0);
    public native @Cast("bool") boolean isFlat();
// #if QT_CONFIG(menu)
    public native void showMenu();
}
