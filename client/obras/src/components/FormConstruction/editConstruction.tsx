import { useFormik } from 'formik';
import { useRouter } from 'next/router';
import * as Yup from 'yup';
import {
  Button,
  Container,
  TextField,
  Box,
  Typography,
  Grid,
} from '@mui/material';
import MenuItem from '@mui/material/MenuItem';
import { IFormData } from './Interface'


export default function EditFormConstruction() {
  const router = useRouter();
  const { id } = router.query;

  const risco = [
    {
      value: 'BAIXO',
      label: 'Baixo',
    },
    {
      value: 'MEDIO',
      label: 'Medio',
    },
    {
      value: 'ALTO',
      label: 'Alto',
    },
  ];

  const tipo = [
    {
      value: 'HIDRAULICA',
      label: 'Hidraulica',
    },
    {
      value: 'ESTRUTURAL',
      label: 'Estrutural',
    },
    {
      value: 'GEOTECNICA',
      label: 'Geotecnica',
    },
  ];

  const initialValues: IFormData = {
    nome: '',
    anoConstrucao: 2022,
    coordenacao: '',
    gerencia: '',
    diretoria: '',
    outorga: '',
    titularidade: '',
    cidade: '',
    estado: '',
    latitude: '',
    longitude: '',
    tipo: '',
    risco: '',
  }

  const formSchema = Yup.object().shape({
    nome: Yup.string()
      .required('Digite o nome da Obra')
      .min(2, 'O nome deve ter pelo menos 2 caracteres!'),
    anoConstrucao: Yup.number().required('Digite o ano da construção!').min(4, 'Não abreviar o ano!'),
    coordenacao: Yup.string().required('Digite a coordenação!'),
    gerencia: Yup.string().required('Digite a gerencia!'),
    diretoria: Yup.string().required('Digite a diretoria!'),
    outorga: Yup.string().required('Digite a outorga!'),
    titularidade: Yup.string().required('Digite a titularidade!'),
    latitude: Yup.string(),
    longitude: Yup.string(),
    cidade: Yup.string().required('Digite a cidade!'),
    estado: Yup.string().required('Digite o estado!'),
    tipo: Yup.string(),
    risco: Yup.string(),
  });

  const formik = useFormik({
    initialValues: initialValues,
    validationSchema: formSchema,
    onSubmit: (values) => {
      setTimeout(() => {
        alert(JSON.stringify(values, null, 2));
        formik.setSubmitting(false);
      }, 3000);
    },
  });

  return (
    <Container>
      <Box sx={{
        flexGrow: 1
      }}>
        <form noValidate onSubmit={formik.handleSubmit}>
          <Box sx={{
            display: 'flex',
            alignItems: 'center',
            marginTop: 5,
            marginBottom: 5,
            marginLeft: 7,
          }}>
            <Typography component="h4" variant="h4">
              Editar
            </Typography>
          </Box>
          <Grid container spacing={2} columns={12}>
            <Grid item xs={4}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="nome"
                label="Nome"
                name="nome"
                autoComplete="nome"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.nome}
                error={formik.touched.nome && Boolean(formik.errors.nome)}
                helperText={formik.touched.nome && formik.errors.nome}
              />
            </Grid>
            <Grid item xs={2}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="anoConstrucao"
                label="Ano da Construção"
                name="anoConstrucao"
                autoComplete="anoConstrucao"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.anoConstrucao}
                error={formik.touched.anoConstrucao && Boolean(formik.errors.anoConstrucao)}
                helperText={formik.touched.anoConstrucao && formik.errors.anoConstrucao}
              />
            </Grid>
            <Grid item xs={4}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="coordenacao"
                label="Coordenação"
                name="coordenacao"
                autoComplete="coordenacao"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.coordenacao}
                error={formik.touched.coordenacao && Boolean(formik.errors.coordenacao)}
                helperText={formik.touched.coordenacao && formik.errors.coordenacao}
              />
            </Grid>
            <Grid item xs={3}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="gerencia"
                label="Gerencia"
                name="gerencia"
                autoComplete="gerencia"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.gerencia}
                error={formik.touched.gerencia && Boolean(formik.errors.gerencia)}
                helperText={formik.touched.gerencia && formik.errors.gerencia}
              />
            </Grid>
            <Grid item xs={3}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="diretoria"
                label="Diretoria"
                name="diretoria"
                autoComplete="diretoria"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.diretoria}
                error={formik.touched.diretoria && Boolean(formik.errors.diretoria)}
                helperText={formik.touched.diretoria && formik.errors.diretoria}
              />
            </Grid>
            <Grid item xs={2}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="outorga"
                label="Outorga"
                name="outorga"
                autoComplete="outorga"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.outorga}
                error={formik.touched.outorga && Boolean(formik.errors.outorga)}
                helperText={formik.touched.outorga && formik.errors.outorga}
              />
            </Grid>
            <Grid item xs={4}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="titularidade"
                label="Titularidade"
                name="titularidade"
                autoComplete="titularidade"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.titularidade}
                error={formik.touched.titularidade && Boolean(formik.errors.titularidade)}
                helperText={formik.touched.titularidade && formik.errors.titularidade}
              />
            </Grid>

          </Grid>
          <Box sx={{
            display: 'flex',
            alignItems: 'center',
            marginTop: 5,
            marginBottom: 5,
            marginLeft: 7,
          }}>
            <Typography component="h4" variant="h4">
              Localização
            </Typography>
          </Box>
          <Grid container spacing={2} columns={12}>

            <Grid item xs={2}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="cidade"
                label="Cidade"
                name="cidade"
                autoComplete="cidade"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.cidade}
                error={formik.touched.cidade && Boolean(formik.errors.cidade)}
                helperText={formik.touched.cidade && formik.errors.cidade}
              />
            </Grid>
            <Grid item xs={2}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="estado"
                label="Estado"
                name="estado"
                autoComplete="estado"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.estado}
                error={formik.touched.estado && Boolean(formik.errors.estado)}
                helperText={formik.touched.estado && formik.errors.estado}
              />
            </Grid>
            <Grid item xs={3}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="latitude"
                label="Latitude"
                name="latitude"
                autoComplete="latitude"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.latitude}
                error={formik.touched.latitude && Boolean(formik.errors.latitude)}
                helperText={formik.touched.latitude && formik.errors.latitude}
              />
            </Grid>
            <Grid item xs={3}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="longitude"
                label="Longitude"
                name="longitude"
                autoComplete="longitude"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.longitude}
                error={formik.touched.longitude && Boolean(formik.errors.longitude)}
                helperText={formik.touched.longitude && formik.errors.longitude}
              />
            </Grid>
          </Grid>
          <Box sx={{
            display: 'flex',
            alignItems: 'center',
            marginTop: 5,
            marginBottom: 5,
            marginLeft: 7,
          }}>
            <Typography component="h4" variant="h4">
              Detalhes Técnicos
            </Typography>
          </Box>
          <Grid container spacing={2} columns={12}>
            <Grid item xs={4}>
              <TextField
                variant="outlined"
                select
                margin="normal"
                fullWidth
                id="tipo"
                label="Tipo"
                name="tipo"
                autoComplete="tipo"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.tipo}
                error={formik.touched.tipo && Boolean(formik.errors.tipo)}
                helperText={formik.touched.tipo && formik.errors.tipo}
              >
                {tipo.map((option) => (
                  <MenuItem key={option.value} value={option.value}>
                    {option.label}
                  </MenuItem>
                ))}
                </TextField>
            </Grid>
            <Grid item xs={4}>
              <TextField
                variant="outlined"
                select
                margin="normal"
                fullWidth
                id="risco"
                label="Risco"
                name="risco"
                autoComplete="risco"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.risco}
                error={formik.touched.risco && Boolean(formik.errors.risco)}
                helperText={formik.touched.risco && formik.errors.risco}
              >
                {risco.map((option) => (
                  <MenuItem key={option.value} value={option.value}>
                    {option.label}
                  </MenuItem>
                ))}
              </TextField>
            </Grid>
          </Grid>

          <Button
            type="submit"
            size="large"
            variant="contained"
            color="primary"
            disabled={formik.isSubmitting}
          >
            Salvar
          </Button>
        </form>
      </Box >
    </Container >
  );
}