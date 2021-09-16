window.onload =function () {
    /*文件上传*/
    var preview = document.querySelector('#preview');
    var file = document.querySelector('#uploadFile');
    var img = document.createElement('img');
    file.onchange=function () {
        var fileReader = new FileReader();
        fileReader.readAsDataURL(this.files[0]);
        fileReader.onload = function () {
            console.log(fileReader.result)
            img.src= fileReader.result;
            img.classList.add("show-img");
            preview.appendChild(img);
        }
    }
}
