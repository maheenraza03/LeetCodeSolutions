/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var timeLimit = function(fn, t) {
    
    return async function(...args) {
        // promise saved inside a function to return at the end
        const timeLimitFunc = new Promise((resolve, reject) => {
            // timer to see if the function runs in the limited time it has (t)
            const timerID = setTimeout(() => {
                reject("Time Limit Exceeded");
            }, t);

            // if the promise doesn't get reject
            Promise.resolve(fn.apply(this, args))
                // return the result of the function
                .then((result) => {
                    resolve(result);
                })

                // if there's an error return the error
                .catch((error) => {
                    reject(error);
                })

                // at the end, clear the timeout (useful when the function resolves before the timeout ends)
                .finally(() => {
                    clearTimeout(timerID);
                });
            

            
        })

        return timeLimitFunc;
      
        
    }
};

/**
 * const limited = timeLimit((t) => new Promise(res => setTimeout(res, t)), 100);
 * limited(150).catch(console.log) // "Time Limit Exceeded" at t=100ms
 */