package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLPageBlockEmbed extends TLAbsPageBlock {
    public static final int CONSTRUCTOR_ID = 0xa8718dc5;

    protected int flags;

    protected boolean fullWidth;

    protected boolean allowScrolling;

    protected String url;

    protected String html;

    protected Long posterPhotoId;

    protected Integer w;

    protected Integer h;

    protected TLPageCaption caption;

    private final String _constructor = "pageBlockEmbed#a8718dc5";

    public TLPageBlockEmbed() {
    }

    public TLPageBlockEmbed(boolean fullWidth, boolean allowScrolling, String url, String html, Long posterPhotoId, Integer w, Integer h, TLPageCaption caption) {
        this.fullWidth = fullWidth;
        this.allowScrolling = allowScrolling;
        this.url = url;
        this.html = html;
        this.posterPhotoId = posterPhotoId;
        this.w = w;
        this.h = h;
        this.caption = caption;
    }

    private void computeFlags() {
        flags = 0;
        flags = fullWidth ? (flags | 1) : (flags & ~1);
        flags = allowScrolling ? (flags | 8) : (flags & ~8);
        flags = url != null ? (flags | 2) : (flags & ~2);
        flags = html != null ? (flags | 4) : (flags & ~4);
        flags = posterPhotoId != null ? (flags | 16) : (flags & ~16);
        flags = w != null ? (flags | 32) : (flags & ~32);
        flags = h != null ? (flags | 32) : (flags & ~32);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        if ((flags & 2) != 0) {
            if (url == null) throwNullFieldException("url", flags);
            writeString(url, stream);
        }
        if ((flags & 4) != 0) {
            if (html == null) throwNullFieldException("html", flags);
            writeString(html, stream);
        }
        if ((flags & 16) != 0) {
            if (posterPhotoId == null) throwNullFieldException("posterPhotoId", flags);
            writeLong(posterPhotoId, stream);
        }
        if ((flags & 32) != 0) {
            if (w == null) throwNullFieldException("w", flags);
            writeInt(w, stream);
        }
        if ((flags & 32) != 0) {
            if (h == null) throwNullFieldException("h", flags);
            writeInt(h, stream);
        }
        writeTLObject(caption, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        fullWidth = (flags & 1) != 0;
        allowScrolling = (flags & 8) != 0;
        url = (flags & 2) != 0 ? readTLString(stream) : null;
        html = (flags & 4) != 0 ? readTLString(stream) : null;
        posterPhotoId = (flags & 16) != 0 ? readLong(stream) : null;
        w = (flags & 32) != 0 ? readInt(stream) : null;
        h = (flags & 32) != 0 ? readInt(stream) : null;
        caption = readTLObject(stream, context, TLPageCaption.class, TLPageCaption.CONSTRUCTOR_ID);
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        if ((flags & 2) != 0) {
            if (url == null) throwNullFieldException("url", flags);
            size += computeTLStringSerializedSize(url);
        }
        if ((flags & 4) != 0) {
            if (html == null) throwNullFieldException("html", flags);
            size += computeTLStringSerializedSize(html);
        }
        if ((flags & 16) != 0) {
            if (posterPhotoId == null) throwNullFieldException("posterPhotoId", flags);
            size += SIZE_INT64;
        }
        if ((flags & 32) != 0) {
            if (w == null) throwNullFieldException("w", flags);
            size += SIZE_INT32;
        }
        if ((flags & 32) != 0) {
            if (h == null) throwNullFieldException("h", flags);
            size += SIZE_INT32;
        }
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

    public boolean getFullWidth() {
        return fullWidth;
    }

    public void setFullWidth(boolean fullWidth) {
        this.fullWidth = fullWidth;
    }

    public boolean getAllowScrolling() {
        return allowScrolling;
    }

    public void setAllowScrolling(boolean allowScrolling) {
        this.allowScrolling = allowScrolling;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public Long getPosterPhotoId() {
        return posterPhotoId;
    }

    public void setPosterPhotoId(Long posterPhotoId) {
        this.posterPhotoId = posterPhotoId;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public TLPageCaption getCaption() {
        return caption;
    }

    public void setCaption(TLPageCaption caption) {
        this.caption = caption;
    }
}
