package es.cuatrogatos.jira.xray.rest.client.api.domain;

import es.cuatrogatos.jira.xray.rest.client.core.internal.json.util.RendereableItem;

/**
 * Created by lucho on 16/08/16.
 */
public class Comment implements RendereableItem {
    private String raw;
    private String rendered;
    public Comment(String raw,String rendered){
        this.raw=raw;
        this.rendered=rendered;
    }

    public String getRendered() {
        return raw;
    }

    public void setRendered(String rendered) {
        this.rendered=rendered;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw=raw;
    }
};
