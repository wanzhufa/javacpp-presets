// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.librealsense.global.RealSense.*;


@Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class rs_frame_callback extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rs_frame_callback(Pointer p) { super(p); }

    public native void on_frame(rs_device device, rs_frame_ref f);
    public native void release();
}