import lombok.Data;

/**
 * @author zshuo
 * @date 2018/9/30
 **/
@Data
public class Id {

    /**
     * 机器id
     */
    private long machineId;

    /**
     * 序列号
     */
    private long ser;

    /**
     * 时间
     */
    private long time;

    /**
     * 生成方式
     */
    private long genMethod;

    /**
     * id类型
     * 0最大峰值类型,1最小粒度类型
     */
    private long type;

    /**
     * 版本
     * 默认:0,1表示扩容
     */
    private long version;
}
