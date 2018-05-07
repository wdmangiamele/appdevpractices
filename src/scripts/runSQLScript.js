var exec = require('child_process').exec;

dir = exec("mysql -u root -pstudent < ../MySQLDB.sql", function(err, stdout, stderr) {
    if (err) {
        console.log("Error: " + stderr)
    }
});