$(document).ready(function() {
    $.ajax("http://localhost:8080/consulting/appointments/v1.0.0/appointment-types")
    .done(function(data) {
        let select = $("#about");
        data.forEach(appointmentType => {
            console.log(appointmentType)
            const option = $("<option/>", {value: appointmentType, text: appointmentType.name});
            select.append(option);
        });
    })
    .fail(function(error) {
        console.log(error);
    });

    $('#submit-appointment').click(function() {
        console.log('Button clicked!');
    });
});