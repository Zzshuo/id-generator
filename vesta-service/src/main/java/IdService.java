import java.util.Date;

/**
 * @author zshuo
 * @date 2018/9/30
 **/
public interface IdService {

    /**
     * 产生唯一 id
     */
    public long genId();

    /**
     * 解析 id 信息
     */
    public Id expId(long id);

    public long makeId(long time, long seq);

    public long makeId(long time, long seq, long mechine);

    public long makeId(long genMethod, long time, long seq, long mechine);

    public long makeId(long type, long genMethod, long time, long seq, long mechine);

    public long makeId(long version, long type, long genMethod, long time, long seq, long mechine);

    /**
     * 整型时间转为Date
     */
    public Date transTime(long time);
}
