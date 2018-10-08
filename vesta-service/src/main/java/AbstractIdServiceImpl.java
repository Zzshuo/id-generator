/**
 * @author zshuo
 * @date 2018/9/30
 **/
public abstract class AbstractIdServiceImpl implements IdService {

    public long genId() {
        Id id = new Id();
        id.setMachineId(1);
        return 0;
    }
}
