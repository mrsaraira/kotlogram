package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLWallPaper}: wallPaper#a437c3ed</li>
 * <li>{@link TLWallPaperNoFile}: wallPaperNoFile#e0804116</li>
 * </ul>
 *
 */
public abstract class TLAbsWallPaper extends TLObject {
    protected long id;

    protected int flags;

    protected boolean defaultt;

    protected boolean dark;

    protected TLWallPaperSettings settings;

    public TLAbsWallPaper() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean getDefaultt() {
        return defaultt;
    }

    public void setDefaultt(boolean defaultt) {
        this.defaultt = defaultt;
    }

    public boolean getDark() {
        return dark;
    }

    public void setDark(boolean dark) {
        this.dark = dark;
    }

    public TLWallPaperSettings getSettings() {
        return settings;
    }

    public void setSettings(TLWallPaperSettings settings) {
        this.settings = settings;
    }
}
