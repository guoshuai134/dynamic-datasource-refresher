package io.github.binarypursuer.refresher.api.model;

import io.github.binarypursuer.refresher.api.enums.ConfigType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 数据源配置对象
 *
 * @author binarypursuer
 * @version 1.0
 * @date 2025/2/28
 */
@Data
public class DsConfig {
    /**
     * 配置ID列表
     */
    private List<ServiceConfig> serviceConfigs;
    /**
     * 数据源标识ID
     */
    private String id;
    /**
     * 数据源连接地址
     */
    private String url;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 驱动类名
     */
    private String driverClassName;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ServiceConfig {
        /**
         * 应用在配置中心的配置ID，如Consul: config/{serviceName},rdc/data
         */
        private String dataId;
        /**
         * 配置组
         */
        private String group;
        /**
         * 文件类型 支持 properties、yaml
         */
        private ConfigType type = ConfigType.YAML;

        public ServiceConfig(String dataId, String group) {
            this.dataId = dataId;
            this.group = group;
        }
    }
}
