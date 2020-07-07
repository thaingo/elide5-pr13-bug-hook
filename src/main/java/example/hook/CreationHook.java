package example.hook;

import com.yahoo.elide.annotation.LifeCycleHookBinding.Operation;
import com.yahoo.elide.functions.LifeCycleHook;
import com.yahoo.elide.security.ChangeSpec;
import com.yahoo.elide.security.RequestScope;
import example.models.Change;
import example.models.Report;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreationHook implements LifeCycleHook<Report> {

    @Override
    public void execute(
        Operation operation, Report report, RequestScope requestScope, Optional<ChangeSpec> optional) {
        // create Change
        Change change = new Change();
        change.setReport(report);

        log.debug("Created Change entity at {} with id {} and ", change.getCreatedAt(), change.getId());
    }
}
