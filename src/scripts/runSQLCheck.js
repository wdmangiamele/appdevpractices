var exec = require('child_process').exec;

dir = exec("mysqlcheck -u root -pstudent -c MySQLDB", function(err, stdout, stderr) {
    if (err) {
        console.log("Error: " + stderr);
    } else {
        console.log(stdout);
    }
});