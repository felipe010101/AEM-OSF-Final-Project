package com.project.osf.core.models.Impl;

import com.project.osf.core.models.Header;
import com.project.osf.core.models.classes.Links;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.factory.ModelFactory;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.Self;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Model(
        adaptables = {SlingHttpServletRequest.class},
        adapters = {Header.class},
        resourceType = {HeaderImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class HeaderImpl implements Header {
    protected static final String RESOURCE_TYPE = "wknd/components/content/header";

    @OSGiService
    private ModelFactory modelFactory;

    @Self
    private SlingHttpServletRequest request;

    @Override
    public List<Links> getLinks(Resource resource) {

        List<Links> temp = null;

        if(resource.hasChildren()){
            Iterator<Resource> iterator = resource.listChildren();
            if(iterator != null){
                temp = new ArrayList<>();
                while (iterator.hasNext()) {
                    Resource item = iterator.next();
                    if (item == null) continue;

                    //if (!item.isResourceType(ServletResourceTypes.RESOURCE_TYPE_CLASS_TYPE_ITEM)) continue;

                    Node node = item.adaptTo(Node.class);

                }
            }
        }

        return temp;
    }
}
