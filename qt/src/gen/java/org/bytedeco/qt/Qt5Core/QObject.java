// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.qt.global.Qt5Core.*;

// Parsed from QtCore/qobject.h

@NoOffset @Properties(inherit = org.bytedeco.qt.presets.Qt5Core.class)
public class QObject extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QObject(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QObject(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QObject position(long position) {
        return (QObject)super.position(position);
    }

    public QObject(QObject parent/*=nullptr*/) { super((Pointer)null); allocate(parent); }
    private native void allocate(QObject parent/*=nullptr*/);
    public QObject() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native @Cast("bool") boolean event(QEvent event);
    public native @Cast("bool") boolean eventFilter(QObject watched, QEvent event);

// #if defined(QT_NO_TRANSLATION) || defined(Q_CLANG_QDOC)
    public static native @ByVal QString tr(@Cast("const char*") BytePointer sourceText, @Cast("const char*") BytePointer arg1/*=nullptr*/, int arg2/*=-1*/);
    public static native @ByVal QString tr(@Cast("const char*") BytePointer sourceText);
    public static native @ByVal QString tr(String sourceText, String arg1/*=nullptr*/, int arg2/*=-1*/);
    public static native @ByVal QString tr(String sourceText);
// #if QT_DEPRECATED_SINCE(5, 0)
// #endif
// #endif //QT_NO_TRANSLATION

    public native @ByVal QString objectName();
    public native void setObjectName(@Const @ByRef QString name);

    public native @Cast("bool") boolean isWidgetType();
    public native @Cast("bool") boolean isWindowType();

    public native @Cast("bool") boolean signalsBlocked();
    public native @Cast("bool") boolean blockSignals(@Cast("bool") boolean b);

    public native int startTimer(int interval, @Cast("Qt::TimerType") int timerType/*=Qt::CoarseTimer*/);
    public native int startTimer(int interval);
// #if QT_HAS_INCLUDE(<chrono>)
// #endif
    public native void killTimer(int id);

// #ifndef QT_NO_REGEXP
// #if QT_DEPRECATED_SINCE(5, 13)
// #endif
// #endif

// #if QT_CONFIG(regularexpression)
// #endif // QT_CONFIG(regularexpression)

    public native void setParent(QObject parent);
    public native void installEventFilter(QObject filterObj);
    public native void removeEventFilter(QObject obj);

// #ifdef Q_CLANG_QDOC
// #else
// #endif //Q_CLANG_QDOC

    public static native @Cast("bool") boolean disconnect(@Const QObject sender, @Cast("const char*") BytePointer signal,
                               @Const QObject receiver, @Cast("const char*") BytePointer member);
    public static native @Cast("bool") boolean disconnect(@Const QObject sender, String signal,
                               @Const QObject receiver, String member);
    public native @Cast("bool") boolean disconnect(@Cast("const char*") BytePointer signal/*=nullptr*/,
                               @Const QObject receiver/*=nullptr*/, @Cast("const char*") BytePointer member/*=nullptr*/);
    public native @Cast("bool") boolean disconnect();
    public native @Cast("bool") boolean disconnect(String signal/*=nullptr*/,
                               @Const QObject receiver/*=nullptr*/, String member/*=nullptr*/);
    public native @Cast("bool") boolean disconnect(@Const QObject receiver, @Cast("const char*") BytePointer member/*=nullptr*/);
    public native @Cast("bool") boolean disconnect(@Const QObject receiver);
    public native @Cast("bool") boolean disconnect(@Const QObject receiver, String member/*=nullptr*/);

// #ifdef Q_CLANG_QDOC
// #else
// #endif //Q_CLANG_QDOC


// #if QT_VERSION < QT_VERSION_CHECK(6, 0, 0)
// #endif
    public native void dumpObjectTree();
    public native void dumpObjectInfo();

// #ifndef QT_NO_PROPERTIES
    public native @Cast("bool") boolean setProperty(@Cast("const char*") BytePointer name, @Const @ByRef QVariant value);
    public native @Cast("bool") boolean setProperty(String name, @Const @ByRef QVariant value);
    
// #endif // QT_NO_PROPERTIES

// #ifndef QT_NO_USERDATA
    public static native @Cast("unsigned int") int registerUserData();
    public native QObject parent();

    public native @Cast("bool") boolean inherits(@Cast("const char*") BytePointer classname);
    public native @Cast("bool") boolean inherits(String classname);
    public native void deleteLater();

}
