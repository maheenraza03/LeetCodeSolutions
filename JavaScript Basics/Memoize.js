/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {

    // acts as a cache to save results so we don't need to calculate them again
    const cache = {};
    
    return function(...args) {
        // getting the arguments
        let argu = JSON.stringify(args);

        // if the arguments already exist in the cache, don't rerun the function but just grab it from cache to save memory
        if (argu in cache) {
            return cache[argu];
        }

        // if its not in cache, get the result by running the funtion, add it to the cache and return it
        let result = fn.apply(this, args);
        cache[argu] = result;
        return result;
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */