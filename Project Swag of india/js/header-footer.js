$(document).ready(function () {
    fetch('/header.html')
    .then(response => response.text())
    .then(function (headerHtml) {
    $('#main-header').html(headerHtml);
    });
    fetch('/footer.html')
    .then(response => response.text())
    .then(function (footerHtml) {
    $('#main-footer').html(footerHtml);
    });
    });