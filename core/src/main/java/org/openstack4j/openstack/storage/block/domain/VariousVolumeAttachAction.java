package org.openstack4j.openstack.storage.block.domain;

import com.fasterxml.jackson.annotation.JsonRootName;
import org.openstack4j.model.ModelEntity;

/**
 * For various volume attach/detach actions. <br/>
 * Example:
 * make sure following steps are requested when attaching a volume to an instance:
 * <ol>
 *     <li>reserve</li>
 *     <li>init connection</li>
 *     <li>attach</li>
 * </ol>
 *
 *  * os-reserve,os-unreserve,
 *  * os-begin_detaching,os-roll_detaching,
 *  * os-initialize_connection,os-terminate_connection,
 * @author --ZHZH-- （sohu-inc.com 钟壮）
 */
public class VariousVolumeAttachAction {
    @JsonRootName("os-reserve")
    public static class ReserveAction implements ModelEntity {
        private static final long serialVersionUID = 1L;
    }

    @JsonRootName("os-unreserve")
    public static class UnreserveAction implements ModelEntity {
        private static final long serialVersionUID = 1L;
    }

    @JsonRootName("os-begin_attaching")
    public static class BeginAttachingAction implements ModelEntity {
        private static final long serialVersionUID = 1L;
    }

    @JsonRootName("os-roll_detaching")
    public static class RollDetachingAction implements ModelEntity {
        private static final long serialVersionUID = 1L;
    }

    @JsonRootName("os-initialize_connection")
    public static class initConnectionAction implements ModelEntity {
        private static final long serialVersionUID = 1L;
        private VolumeConnectorOption connector;

        public VolumeConnectorOption getConnector() {
            return connector;
        }

        public void setConnector(VolumeConnectorOption connector) {
            this.connector = connector;
        }
    }

    @JsonRootName("os-terminate_connection")
    public static class terminateConnectionAction implements ModelEntity {
        private static final long serialVersionUID = 1L;
        private VolumeConnectorOption connector;

        public VolumeConnectorOption getConnector() {
            return connector;
        }

        public void setConnector(VolumeConnectorOption connector) {
            this.connector = connector;
        }
    }

}
