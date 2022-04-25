package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLPageBlockVideo extends TLAbsPageBlock {
    public static final int CONSTRUCTOR_ID = 0x7c8fe7b6;

    protected int flags;

    protected boolean autoplay;

    protected boolean loop;

    protected long videoId;

    protected TLPageCaption caption;

    private final String _constructor = "pageBlockVideo#7c8fe7b6";

    public TLPageBlockVideo() {
    }

    public TLPageBlockVideo(boolean autoplay, boolean loop, long videoId, TLPageCaption caption) {
        this.autoplay = autoplay;
        this.loop = loop;
        this.videoId = videoId;
        this.caption = caption;
    }

    private void computeFlags() {
        flags = 0;
        flags = autoplay ? (flags | 1) : (flags & ~1);
        flags = loop ? (flags | 2) : (flags & ~2);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeLong(videoId, stream);
        writeTLObject(caption, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        autoplay = (flags & 1) != 0;
        loop = (flags & 2) != 0;
        videoId = readLong(stream);
        caption = readTLObject(stream, context, TLPageCaption.class, TLPageCaption.CONSTRUCTOR_ID);
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += SIZE_INT64;
        size += caption.computeSerializedSize();
        return size;
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }

    public boolean getAutoplay() {
        return autoplay;
    }

    public void setAutoplay(boolean autoplay) {
        this.autoplay = autoplay;
    }

    public boolean getLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    public long getVideoId() {
        return videoId;
    }

    public void setVideoId(long videoId) {
        this.videoId = videoId;
    }

    public TLPageCaption getCaption() {
        return caption;
    }

    public void setCaption(TLPageCaption caption) {
        this.caption = caption;
    }
}
