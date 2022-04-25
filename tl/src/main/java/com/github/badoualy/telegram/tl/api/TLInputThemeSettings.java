package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLIntVector;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLInputThemeSettings extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x8fde504f;

    protected int flags;

    protected boolean messageColorsAnimated;

    protected TLAbsBaseTheme baseTheme;

    protected int accentColor;

    protected Integer outboxAccentColor;

    protected TLIntVector messageColors;

    protected TLAbsInputWallPaper wallpaper;

    protected TLWallPaperSettings wallpaperSettings;

    private final String _constructor = "inputThemeSettings#8fde504f";

    public TLInputThemeSettings() {
    }

    public TLInputThemeSettings(boolean messageColorsAnimated, TLAbsBaseTheme baseTheme, int accentColor, Integer outboxAccentColor, TLIntVector messageColors, TLAbsInputWallPaper wallpaper, TLWallPaperSettings wallpaperSettings) {
        this.messageColorsAnimated = messageColorsAnimated;
        this.baseTheme = baseTheme;
        this.accentColor = accentColor;
        this.outboxAccentColor = outboxAccentColor;
        this.messageColors = messageColors;
        this.wallpaper = wallpaper;
        this.wallpaperSettings = wallpaperSettings;
    }

    private void computeFlags() {
        flags = 0;
        flags = messageColorsAnimated ? (flags | 4) : (flags & ~4);
        flags = outboxAccentColor != null ? (flags | 8) : (flags & ~8);
        flags = messageColors != null ? (flags | 1) : (flags & ~1);
        flags = wallpaper != null ? (flags | 2) : (flags & ~2);
        flags = wallpaperSettings != null ? (flags | 2) : (flags & ~2);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeTLObject(baseTheme, stream);
        writeInt(accentColor, stream);
        if ((flags & 8) != 0) {
            if (outboxAccentColor == null) throwNullFieldException("outboxAccentColor", flags);
            writeInt(outboxAccentColor, stream);
        }
        if ((flags & 1) != 0) {
            if (messageColors == null) throwNullFieldException("messageColors", flags);
            writeTLVector(messageColors, stream);
        }
        if ((flags & 2) != 0) {
            if (wallpaper == null) throwNullFieldException("wallpaper", flags);
            writeTLObject(wallpaper, stream);
        }
        if ((flags & 2) != 0) {
            if (wallpaperSettings == null) throwNullFieldException("wallpaperSettings", flags);
            writeTLObject(wallpaperSettings, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        messageColorsAnimated = (flags & 4) != 0;
        baseTheme = readTLObject(stream, context, TLAbsBaseTheme.class, -1);
        accentColor = readInt(stream);
        outboxAccentColor = (flags & 8) != 0 ? readInt(stream) : null;
        messageColors = (flags & 1) != 0 ? readTLIntVector(stream, context) : null;
        wallpaper = (flags & 2) != 0 ? readTLObject(stream, context, TLAbsInputWallPaper.class, -1) : null;
        wallpaperSettings = (flags & 2) != 0 ? readTLObject(stream, context, TLWallPaperSettings.class, TLWallPaperSettings.CONSTRUCTOR_ID) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += baseTheme.computeSerializedSize();
        size += SIZE_INT32;
        if ((flags & 8) != 0) {
            if (outboxAccentColor == null) throwNullFieldException("outboxAccentColor", flags);
            size += SIZE_INT32;
        }
        if ((flags & 1) != 0) {
            if (messageColors == null) throwNullFieldException("messageColors", flags);
            size += messageColors.computeSerializedSize();
        }
        if ((flags & 2) != 0) {
            if (wallpaper == null) throwNullFieldException("wallpaper", flags);
            size += wallpaper.computeSerializedSize();
        }
        if ((flags & 2) != 0) {
            if (wallpaperSettings == null) throwNullFieldException("wallpaperSettings", flags);
            size += wallpaperSettings.computeSerializedSize();
        }
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

    public boolean getMessageColorsAnimated() {
        return messageColorsAnimated;
    }

    public void setMessageColorsAnimated(boolean messageColorsAnimated) {
        this.messageColorsAnimated = messageColorsAnimated;
    }

    public TLAbsBaseTheme getBaseTheme() {
        return baseTheme;
    }

    public void setBaseTheme(TLAbsBaseTheme baseTheme) {
        this.baseTheme = baseTheme;
    }

    public int getAccentColor() {
        return accentColor;
    }

    public void setAccentColor(int accentColor) {
        this.accentColor = accentColor;
    }

    public Integer getOutboxAccentColor() {
        return outboxAccentColor;
    }

    public void setOutboxAccentColor(Integer outboxAccentColor) {
        this.outboxAccentColor = outboxAccentColor;
    }

    public TLIntVector getMessageColors() {
        return messageColors;
    }

    public void setMessageColors(TLIntVector messageColors) {
        this.messageColors = messageColors;
    }

    public TLAbsInputWallPaper getWallpaper() {
        return wallpaper;
    }

    public void setWallpaper(TLAbsInputWallPaper wallpaper) {
        this.wallpaper = wallpaper;
    }

    public TLWallPaperSettings getWallpaperSettings() {
        return wallpaperSettings;
    }

    public void setWallpaperSettings(TLWallPaperSettings wallpaperSettings) {
        this.wallpaperSettings = wallpaperSettings;
    }
}
