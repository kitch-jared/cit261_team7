<!DOCTYPE html>
<html>
<head>
    <title>Ajax Example</title>
</head>
    
<body>

    <div id="changeableText"><h2>This content is going to change</h2></div>

    <br><button type="button" onclick="changeText()">Change Content</button>

    <script type="text/javascript">
        function changeText() {
            var xhttp = new XMLHttpRequest(); // Create your object of XMLHttpRequest
            xhttp.onreadystatechange = function() { // Using
                if (xhttp.readyState === 4 && xhttp.status === 200) {
                    /* readyState 4 = request finished and response is ready
                     * status 200 = page "OK"
                     */
                    document.getElementById("changeableText").innerHTML = xhttp.responseText;
                }
            };
            xhttp.open("GET", "simpleAjax.txt", true);
            xhttp.send();
        }
    </script>
    <br><br>
    
<br>Code:<br>
<textarea cols="100" rows="25">
<head>
    <title>Ajax Example</title>
</head>
    
<body>

    <div id="changeableText"><h2>This content is going to change</h2></div>

    <br><button type="button" onclick="changeText()">Change Content</button>

    <script type="text/javascript">
        function changeText() {
            var xhttp = new XMLHttpRequest(); // Create your object of XMLHttpRequest
            xhttp.onreadystatechange = function() { // Using
                if (xhttp.readyState === 4 && xhttp.status === 200) {
                    /* readyState 4 = request finished and response is ready
                     * status 200 = page "OK"
                     */
                    document.getElementById("changeableText").innerHTML = xhttp.responseText;
                }
            };
            xhttp.open("GET", "simpleAjax.txt", true);
            xhttp.send();
        }
    </script>

</body>

</textarea>

<br><br>
<br>simpleAjax.txt:<br>
<textarea cols="100" rows="3">
This is the new text that will be displayed.<br>
If you are seeing this, you have clicked the button.
</textarea>

</body>
</html>