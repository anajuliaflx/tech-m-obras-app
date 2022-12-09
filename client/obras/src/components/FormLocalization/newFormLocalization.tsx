import react, { useState } from 'react';
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
import CircularProgress from '@mui/material/CircularProgress';
import { NewFormData } from './Interface';
import api from '../../api';


export default function NewFormLocalization() {
  const [loading, setLoading] = useState<boolean>(false);
  const router = useRouter();
  const { id } = router.query;

  const onSubmit = async (formData: any) => {
    setLoading(true);
    try {
      const { data } = await api.post(`api/obra/${id}`, formData);
      if (data) {
        setLoading(false);
        router.push('/');
      }
    } catch (error) {
      console.log(error);
    }
    setLoading(false);
  };

  const initialValues: NewFormData = {
    cidade: "",
    estado: "",
    latitude: "",
    longitude: "",
  };

  const formSchema = Yup.object().shape({
    cidade: Yup.string().required('Digite o cidade da cidade'),
    estado: Yup.string().required('Digite o ano da estado!'),
    longitude: Yup.string().required('Digite a longitude!'),
    latitude: Yup.string().required('Digite a latitude!'),
  });

  const formik = useFormik({
    initialValues: initialValues,
    validationSchema: formSchema,
    onSubmit,
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
              Adicionar Localização
            </Typography>
          </Box>
          <Grid container spacing={2} columns={12}>
            <Grid item xs={4}>
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
            <Grid item xs={4}>
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
          </Grid>
          <Button
            type="submit"
            size="large"
            variant="contained"
            color="primary"
            disabled={loading && formik.isSubmitting}
          >
            {loading && <CircularProgress />}Salvar
          </Button>
        </form>
      </Box >
    </Container >
  );
}