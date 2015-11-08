package rafaelgoncalves.mapskills.api;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Transactional
public class TransactionalProxy {

	@AroundInvoke
	private Object intercept(InvocationContext invocationContext) throws Throwable {
		Optional<Object> object = Optional.empty(); 
		try {
			object = Optional.of(invocationContext.proceed());
			System.out.println("Method called: " + invocationContext.getMethod());
		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		}
		return object.get();
	}
	
}
