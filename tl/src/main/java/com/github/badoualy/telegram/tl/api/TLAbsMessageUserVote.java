package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLMessageUserVote}: messageUserVote#34d247b4</li>
 * <li>{@link TLMessageUserVoteInputOption}: messageUserVoteInputOption#3ca5b0ec</li>
 * <li>{@link TLMessageUserVoteMultiple}: messageUserVoteMultiple#8a65e557</li>
 * </ul>
 *
 */
public abstract class TLAbsMessageUserVote extends TLObject {
    protected long userId;

    protected int date;

    public TLAbsMessageUserVote() {
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
